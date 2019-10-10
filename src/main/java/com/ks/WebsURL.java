package com.ks;

import org.springframework.stereotype.Component;

@Component
public class WebsURL {

    private String[] webUrls = {
            "https://www.praca.pl/s-java,szczecin.html?p=Java&m=Szczecin&adp=0",
            "https://www.linkedin.com/jobs/search/?geoId=90009838&keywords=java&location=Szczecin%20i%20okolice&originalSubdomain=pl",
            "https://nofluffjobs.com/jobs/szczecin/java?criteria=city%3Dszczecin%20java",
            "https://pl.indeed.com/praca?as_and=java&as_phr=&as_any=junior%2C+associate%2C+trainee%2C+m%C5%82odszy&as_not=&as_ttl=&as_cmp=&jt=all&st=&as_src=&radius=25&l=Szczecin%2C+zachodniopomorskie&fromage=any&limit=50&sort=&psf=advsrch",
            "https://ogloszenia.infoludek.pl/ogloszenia/kategorie/page/id,73,start,0,size,40",
            "https://ogloszenia.infoludek.pl/ogloszenia/kategorie/page/id,73,start,40,size,40",
            "https://www.olx.pl/praca/informatyka/szczecin/?t=Java",
            "https://www.absolvent.pl/oferty-pracy/q/java/m/szczecin",
            "https://www.jobs.pl/praca/szczecin/java;k"
            };

    private String[] words = {"junior", "trainee", "associate", "młodszy"};

    String[] getWebUrls() {
        return webUrls;
    }

    String[] getWords() {
        return words;
    }

}
