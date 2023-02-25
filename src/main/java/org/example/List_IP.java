package org.example;

import java.util.ArrayList;

public class List_IP {
    ArrayList<String> score_mail = new ArrayList<>();
    ArrayList<String> multirbl_mail = new ArrayList<>();
    int num = 0;
    int numM = 0;

    public List_IP() {
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.130&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.131&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.132&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.133&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.134&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.135&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.136&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.137&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.138&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.139&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.140&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.141&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.184.142&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.98&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.99&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.100&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.101&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.102&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.103&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.104&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.105&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.106&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.107&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.108&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.109&authenticated=true");
        score_mail.add("https://senderscore.org/assess/get-your-score/report/?lookup=92.204.250.110&authenticated=true");

        ////////////////////
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.130.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.131.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.132.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.133.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.134.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.135.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.136.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.137.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.138.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.139.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.140.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.141.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.184.142.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.98.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.98.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.99.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.100.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.101.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.102.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.103.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.104.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.105.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.106.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.107.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.108.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.109.html");
        multirbl_mail.add("https://multirbl.valli.org/lookup/92.204.250.110.html");
    }

    public String getnextIPscore(){
        return score_mail.get(num++);
    }
    public String getnextIPmultirbl(){
        return multirbl_mail.get(numM++);
    }
}

