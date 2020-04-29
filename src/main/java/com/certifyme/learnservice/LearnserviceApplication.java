package com.certifyme.learnservice;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.certifyme.learnservice.logic.SakaiWebServiceLogic;
import com.certifyme.learnservice.models.Site;

@SpringBootApplication
public class LearnserviceApplication {

	public static void main(String[] args) {
		SakaiWebServiceLogic swl = new SakaiWebServiceLogic();
		swl.setAdminUsername("jaykrs@gmail.com");
		swl.setAdminPassword("xxxxx");
		swl.setLoginUrl("https://xxxxxx.xxx/sakai-ws/soap/login?wsdl");
		swl.setScriptUrl("https://xxxxxx.xxx/sakai-ws/soap/sakai?wsdl");
		List<Site> slist = swl.getAllSitesForUser("jaykrs@gmail.com");
		System.out.println(slist.size());
		SpringApplication.run(LearnserviceApplication.class, args);
	}

}
