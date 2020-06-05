package org.sid.servicesImpl;


import java.io.File;
import java.util.List;
import java.util.Optional;

import org.sid.dao.AccidentRepository;

import org.sid.dao.ChauffeurRepository;
import org.sid.dao.DeclarationAccidentRepository;
import org.sid.dao.DegatRepository;

import org.sid.dao.DistrictRepository;
import org.sid.dao.EmplacementRepository;
import org.sid.dao.LineRepository;
import org.sid.dao.ReceveurRepository;
import org.sid.dao.RecordRepository;

import org.sid.dao.TransportRepository;
import org.sid.dto.DeclarationAccidenttDto;
import org.sid.entities.Accident;

import org.sid.entities.Chauffeur;
import org.springframework.beans.factory.annotation.Value;

import org.sid.entities.DeclarationAccident;
import org.sid.entities.Degat;

import org.sid.entities.District;
import org.sid.entities.Emplacement;
import org.sid.entities.Line;
import org.sid.entities.Receveur;
import org.sid.entities.Record;
import org.sid.entities.SourceInfo;
import org.sid.entities.Transport;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;

import org.sid.services.DeclarationAccidenttService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Service
public class DeclarationAccidenttServiceImpl implements DeclarationAccidenttService{
	 
		
	@Autowired 
	  private DeclarationAccidentRepository  declarationAccRepository;
	@Autowired
	private AccidentRepository accidentRepository;
	@Autowired
	private EmplacementRepository emplacementRepository;
	@Autowired
	private ChauffeurRepository chauffeurRepository;
	@Autowired
	private ReceveurRepository receveurRepository;
	@Autowired
	private TransportRepository transportRepository;
	@Autowired
	private LineRepository lineRepository;
	@Autowired
	private DistrictRepository districtRepository;
	@Autowired
	private DegatRepository degatRepository;
	@Autowired
	private RecordRepository recordRepository;
	 
	  
	  Accident  accident;
	  SourceInfo  sourceInfo;
	  Chauffeur chauffeur;
	  Receveur receveur;
	  Emplacement emplacement;
	  Transport transport;
	  Line line;
	  District district ;
	  Degat degat ;
	  Record record ;
	  
	  
	  
	  @Override
		public Boolean saveDeclaration(@RequestParam("file") MultipartFile file,@RequestParam("declarationAccident")DeclarationAccidenttDto declarationDto) throws JsonParseException , JsonMappingException , Exception {
		 
		  
		  DeclarationAccident  declarationAccident = new DeclarationAccident();
		  Emplacement emplacement =emplacementRepository.findById(declarationDto.getIdEmplacement()).orElse(null);
		
			Chauffeur chauffeur =chauffeurRepository.findById(declarationDto.getIdChauffeur()).orElse(null);
			Receveur receveur =receveurRepository.findById(declarationDto.getIdReceveur()).orElse(null);
			 Transport transport =transportRepository.findById(declarationDto.getIdTransport()).orElse(null);
			Line line =lineRepository.findById(declarationDto.getIdLine()).orElse(null);
			District district =districtRepository.findById(declarationDto.getIdDistrict()).orElse(null);
			
			 boolean isExit = new File(context.getRealPath("/Images/")).exists();
        if (!isExit)
        {
        	new File (context.getRealPath("/Images/")).mkdir();
        	System.out.println("mk dir.............");
        }
        String filename = file.getOriginalFilename();
        String newFileName = FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename);
        File serverFile = new File (context.getRealPath("/Images/"+File.separator+newFileName));
        try
        {
        	System.out.println("Image");
        	 FileUtils.writeByteArrayToFile(serverFile,file.getBytes());
        	 
        }catch(Exception e) {
        	e.printStackTrace();
        }

			  String nameInfo=declarationDto.getNameInfo();
				String lastNameInfo=declarationDto.getLastNameInfo();
				 String phoneInfo=declarationDto.getPhoneInfo();
				 String regExpPhone ="^\\d{8}$";	
				if(nameInfo== ""){
					RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				if(nameInfo==null){
					RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				if(lastNameInfo== ""){
					RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				if(lastNameInfo==null){
					RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				if(!(phoneInfo).matches(regExpPhone)){
					RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
			 
			  
			 
				
				
				  
				declarationAccident.setAccidenttype(declarationDto.getAccidenttype());
			 declarationAccident.setNatureInfo(declarationDto.getNatureInfo());
				declarationAccident.setPhoneInfo(phoneInfo);
				declarationAccident.setNameInfo(nameInfo);
				declarationAccident.setLastNameInfo(lastNameInfo);
				declarationAccident.setDateAccident(declarationDto.getDateAccident());
				declarationAccident.setDistrict(district);
				declarationAccident.setLine(line);
				declarationAccident.setEmplacement(emplacement);
				declarationAccident.setTransport(transport);
			   declarationAccident.setChauffeur(chauffeur);
			   declarationAccident.setReceveur(receveur);
			   declarationAccident.setAccidentsubtype(declarationDto.getAccidentsubtype());
			   declarationAccident.setDegattype(declarationDto.getDegattype());
			   declarationAccident.setDeath(declarationDto.getDeath());
			   declarationAccident.setWounded(declarationDto.getWounded());
			   declarationAccident.setRecord(declarationDto.getRecord());
			   declarationAccident.setDescription(declarationDto.getDescription());
                         declarationAccident.setPhoto(newFileName);
			   System.out.println("ajout declaration");
			   declarationAccRepository.save(declarationAccident);
			return true;
			
		}

@GetMapping(path="/ImgDeclaration/{id}")
	 public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
		 DeclarationAccident declarationAccident   = declarationAccRepository.findById(id).get();
		 return Files.readAllBytes(Paths.get(context.getRealPath("/Images/")+declarationAccident.getPhoto()));
	 }
	
	@Override
	public Boolean updateDeclaration(Long id, DeclarationAccidenttDto declarationDto,@RequestParam(name="picture") MultipartFile file) {
		DeclarationAccident  declarationAccident = declarationAccRepository.findById(id).orElse(null);
		Emplacement emplacement =emplacementRepository.findById(declarationDto.getIdEmplacement()).orElse(null);
		Chauffeur chauffeur =chauffeurRepository.findById(declarationDto.getIdChauffeur()).orElse(null);
		Receveur receveur =receveurRepository.findById(declarationDto.getIdReceveur()).orElse(null);
		 Transport transport =transportRepository.findById(declarationDto.getIdTransport()).orElse(null);
		Line line =lineRepository.findById(declarationDto.getIdLine()).orElse(null);
		District district =districtRepository.findById(declarationDto.getIdDistrict()).orElse(null);
		
		 
		  String nameInfo=declarationDto.getNameInfo();
			String lastNameInfo=declarationDto.getLastNameInfo();
			 String phoneInfo=declarationDto.getPhoneInfo();
			 String regExpPhone ="^\\d{8}$";	
			if(nameInfo== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameInfo==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(lastNameInfo== ""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameInfo==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(phoneInfo).matches(regExpPhone)){
				RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
		 
		  
		 
			
			
			  
			declarationAccident.setAccidenttype(declarationDto.getAccidenttype());
		 declarationAccident.setNatureInfo(declarationDto.getNatureInfo());
			declarationAccident.setPhoneInfo(phoneInfo);
			declarationAccident.setNameInfo(nameInfo);
			declarationAccident.setLastNameInfo(lastNameInfo);
			declarationAccident.setDateAccident(declarationDto.getDateAccident());
			declarationAccident.setDistrict(district);
			declarationAccident.setLine(line);
			declarationAccident.setEmplacement(emplacement);
			declarationAccident.setTransport(transport);
		   declarationAccident.setChauffeur(chauffeur);
		   declarationAccident.setReceveur(receveur);
		   declarationAccident.setAccidentsubtype(declarationDto.getAccidentsubtype());
		   declarationAccident.setDegattype(declarationDto.getDegattype());
		   declarationAccident.setDeath(declarationDto.getDeath());
		   declarationAccident.setWounded(declarationDto.getWounded());		
		   declarationAccident.setRecord(declarationDto.getRecord());
		   declarationAccident.setDescription(declarationDto.getDescription());
		   if(!(file.isEmpty())) {
			   declarationAccident.setPhoto(file.getOriginalFilename());
			   }
		   System.out.println("ajout declaration");
		   declarationAccRepository.save(declarationAccident);
		return true;
		
		
	}
	@Override
	public List<DeclarationAccident> fetchListDeclaration() {
		return declarationAccRepository.findAll();
	}
	@Override
	public void deleteById(Long id) {
		if(!declarationAccRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		declarationAccRepository.findById(id)
        .map(declarationAcc -> {
        	declarationAccRepository.delete(declarationAcc);
            return true;
        });

	}
	@Override
	public Optional<DeclarationAccident> findById(Long id) {
		// TODO Auto-generated method stub
		return declarationAccRepository.findById(id);
	}

	

	
	  
}
