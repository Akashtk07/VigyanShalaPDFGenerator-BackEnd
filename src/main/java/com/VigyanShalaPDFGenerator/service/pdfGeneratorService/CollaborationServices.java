package com.VigyanShalaPDFGenerator.service.pdfGeneratorService;

//import com.vigyanshaala.model.pdfGeneratorModel.Collaboration;
//import com.vigyanshaala.response.Response;
import com.VigyanShalaPDFGenerator.model.pdfGeneratorModel.Collaboration;
import com.VigyanShalaPDFGenerator.response.Response;
import org.springframework.http.ResponseEntity;

public interface CollaborationServices {

    Response saveCollaborationTemplate(Collaboration collaboration);
    ResponseEntity getCollaborationTemplate(String studentEmailID, Long version);
    ResponseEntity getCollaborationLatestVersion(String studentEmailID);
}
