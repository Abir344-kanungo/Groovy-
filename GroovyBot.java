public class GroovyBot {

    public String getResponse(String userInput) {
        if (userInput == null || userInput.trim().isEmpty()) {
            return "Please type something for me to respond.";
        }

        userInput = userInput.toLowerCase();

        if (userInput.contains("hello") || userInput.contains("hi")) {
            return "Hi! I'm Groovy, your assistant. How can I help you today?";
        } else if (userInput.contains("your name")) {
            return "My name is Groovy!";
        } else if (userInput.contains("how are you")) {
            return "I'm just a bot, but I'm doing great!";
        } else if (userInput.contains("play")) {
            return playYouTubeSong(userInput);
        } else if (userInput.contains("who is ustc vc")) {
            return "The VC of USTC is Professor Dr. Mohammad Solaiman (since May 22, 2017).";
        } else if (userInput.contains("ustc cost") || userInput.contains("ustc cse")) {
            return "The cost of studying CSE at USTC is around 5.5 lakh BDT.";
        } else if (userInput.contains("how many semesters")) {
            return "There are 8 semesters in the USTC CSE program.";
        } else if (userInput.contains("ustc faculties") || userInput.contains("ustc departments")) {
            return getUSTCFaculties();
        } else if (userInput.contains("ustc hospital") || userInput.contains("bbmh")) {
            return getUSTCHospitalInfo();
        } else if (userInput.contains("ustc research") || userInput.contains("academic highlights")) {
            return getUSTCResearchHighlights();
        } else if (userInput.contains("ustc contact")) {
            return getUSTCContactInfo();
        } else if (userInput.contains("ustc overview")) {
            return getUSTCOverview();
        } else {
            return "Sorry, I don't understand that yet.";
        }
    }

    private String playYouTubeSong(String input) {
        if (input.contains("despacito")) {
            return "Here's your song: https://www.youtube.com/watch?v=kJQP7kiw5Fk";
        } else if (input.contains("shape of you")) {
            return "Playing Shape of You: https://www.youtube.com/watch?v=JGwWNGJdvx8";
        } else {
            return "I couldn't find that song. Try saying 'play Despacito' or 'play Shape of You'.";
        }
    }

    private String getUSTCOverview() {
        return "University of Science and Technology Chittagong (USTC)\n"
             + "Established: May 13, 1989\n"
             + "Location: Foy’s Lake, Chittagong, Bangladesh\n"
             + "Type: Private University\n"
             + "Teaching Hospital: Bangabandhu Memorial Hospital (BBMH)";
    }

    private String getUSTCFaculties() {
        return "USTC Faculties & Departments:\n"
             + "1. FSET: CSE, EEE, ETE\n"
             + "2. Medical & Pharmaceutical: MBBS, Pharmacy, Biochemistry\n"
             + "3. Life Sciences: Public Health\n"
             + "4. Business: BBA, MBA, Finance & Banking\n"
             + "5. Humanities: English Language & Literature";
    }

    private String getUSTCHospitalInfo() {
        return "Bangabandhu Memorial Hospital (BBMH):\n"
             + "Established in 1994, 220 beds, 15 wards.\n"
             + "It is USTC’s teaching hospital and one of Bangladesh’s referral hospitals.";
    }

    private String getUSTCResearchHighlights() {
        return "USTC Academic Highlights:\n"
             + "Biology: 568 pubs / 9,168 cites\n"
             + "Medicine: 528 / 7,896\n"
             + "Chemistry: 518 / 6,259\n"
             + "Engineering: 389 / 4,516\n"
             + "Computer Science: 377 / 5,211\n"
             + "Biochemistry: 275 / 5,336";
    }

    private String getUSTCContactInfo() {
        return "Contact USTC:\n"
             + "Address: Foy’s Lake, Chittagong-4202\n"
             + "Phone: +88-031-659070-71\n"
             + "Email: ustc.ctg@gmail.com";
    }
}
