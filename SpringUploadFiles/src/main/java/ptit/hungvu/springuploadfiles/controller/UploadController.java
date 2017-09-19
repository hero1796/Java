package ptit.hungvu.springuploadfiles.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import ptit.hungvu.springuploadfiles.form.UploadForm;

@Controller
public class UploadController {
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		Object target = dataBinder.getTarget();
		if(target == null) {
			return;
		}
		System.out.println("Target = " + target);
		if(target.getClass().equals(UploadForm.class)) {
			dataBinder.registerCustomEditor(byte.class, new ByteArrayMultipartFileEditor());
		}
	}
	
	@RequestMapping(value = "/uploadOneFile", method = RequestMethod.GET)
	public String uploadOneFile(Model model) {
		UploadForm uploadForm = new UploadForm();
		model.addAttribute("uploadForm", uploadForm);
		return "uploadOneFile";
	}
	
	@RequestMapping(value = "/uploadOneFile", method = RequestMethod.POST)
	public String uploadOneFilePOST(HttpServletRequest req, Model model, 
			@ModelAttribute("uploadForm") UploadForm uploadForm) {
		return this.doUpload(req, model, uploadForm);
	}
	
	@RequestMapping(value = "/uploadMultiFile", method = RequestMethod.GET)
	public String uploadMultiFile(Model model) {
		UploadForm uploadForm = new UploadForm();
		model.addAttribute("uploadForm", uploadForm);
		return "uploadMultiFile";
	}
	
	@RequestMapping(value = "/uploadMultiFile", method = RequestMethod.POST)
	public String uploadMultiFilePOST(HttpServletRequest req, Model model, 
			@ModelAttribute("uploadForm") UploadForm uploadForm) {
		return this.doUpload(req, model, uploadForm);
	}
	
	private String doUpload(HttpServletRequest req, Model model, UploadForm uploadForm) {
		String des = uploadForm.getDescription();
		System.out.println("Description: " + des);
		String uploadRootPath = req.getServletContext().getRealPath("upload");
		System.out.println("UploadRootPath = " + uploadRootPath);
		File uploadDir = new File(uploadRootPath);
		if(!uploadDir.exists()) {
			uploadDir.mkdirs();
		}
		CommonsMultipartFile[] fileDatas = uploadForm.getFileDatas();
		ArrayList<File> uploadedFiles = new ArrayList<File>();
		for(CommonsMultipartFile fileData : fileDatas) {
			String fileName = fileData.getOriginalFilename();
			System.out.println("Client file'name = " + fileName);
			if(fileName != null && fileName.length() > 0) {
				try {
					File serverFile = new File(uploadDir.getAbsolutePath() + File.separator + fileName);
					BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(serverFile));
					out.write(fileData.getBytes());
					out.close();
					uploadedFiles.add(serverFile);
					System.out.println("Server file : " + serverFile);
				} catch(IOException e) {
					System.out.println("Error write file " + fileName);
				}
			}
		}
		model.addAttribute("description", des);
		model.addAttribute("uploadesFiles", uploadedFiles);
		return "uploadResult";
	}
}
