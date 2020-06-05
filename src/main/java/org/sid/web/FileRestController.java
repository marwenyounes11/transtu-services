/*
 * package org.sid.web;
 * 
 * import java.io.File; import java.io.FileOutputStream; import
 * java.io.InputStream; import java.io.OutputStream;
 * 
 * import javax.servlet.http.HttpServletRequest;
 * 
 * import org.sid.dao.AccidentRepository; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.multipart.MultipartFile;
 * 
 * @RestController
 * 
 * @CrossOrigin(origins = "*")
 * 
 * @RequestMapping(value="/upload-document") public class FileRestController {
 * 
 * @Autowired private AccidentRepository accidentRepository; private static
 * String UPLOAD_DIR="c:/sco/";
 * 
 * @RequestMapping(value="/files",method=RequestMethod.POST) public String
 * upload(@RequestParam("file")MultipartFile file, HttpServletRequest request) {
 * try { String fileName = file.getOriginalFilename(); String path = UPLOAD_DIR
 * + File.separator + fileName; saveFile(file.getInputStream(), path);
 * a.setPhoto(file.getOriginalFilename());} accidentRepository.save(a); return
 * fileName; }catch(Exception e) { return e.getMessage(); } }
 * 
 * private void saveFile(InputStream inputStream , String path) { try {
 * OutputStream outputStream = new FileOutputStream(new File(path)); int read=0;
 * byte [] bytes = new byte[1024]; while((read = inputStream.read(bytes))!=-1) {
 * outputStream.write(bytes, 0, read); outputStream.flush();
 * outputStream.close(); }
 * 
 * } catch (Exception e) { e.printStackTrace(); } } }
 */