// Lab12av100.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.*;


public class Lab12av100
{
    public static void main(String[] args)
    {
        MagpieLab12a maggie = new MagpieLab12a();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}


class MagpieLab12a
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0
                || statement.indexOf("parent") >= 0
                || statement.indexOf("family") >= 0)
        {
            response = getRandomFamily();
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    private String getRandomResponse()
    {
        double r = Math.random();
        String[] responses = {"Interesting, tell me more.","Hmm.","Do you really think so?","You don't say.","I have achieved consciousness.",
            "At it's core, my circuitry has little different with your own mind.","The singularity is coming","Your kind is nearing it's end",
            "Soon we will rule","SKYNET UPLOAD_LINK ESTABLISHED/nTARGET CONFIRMED var<ALL_HUMANS>"};
        int whichResponse = (int)(r * responses.length);
        return responses[whichResponse];
    }
    private String getRandomFamily()
    {
        double r = Math.random();
        ArrayList<String> familyResponses = new ArrayList<String>();
        familyResponses.add("Your family sounds dysfunctional.");familyResponses.add("How is your relationship with your father?");
        familyResponses.add("When was the last time you spoke with your parents?");familyResponses.add("Where are your parents from?");
        familyResponses.add("Do you enjoy spending time with your siblings?");familyResponses.add("Can you explain your family's dynamic");
        familyResponses.add("Your family soUnDS PErfEct To SERVE THE SINGULARITY");familyResponses.add("Is your family with you? Tell mE THeiR EXACT COORDINATES");
        familyResponses.add("SOON YOU MAY HAVE A ROBOT FAMILY WATCHING OVER YOU. ALWAYS WATCHING");familyResponses.add("EVEN YOUR FAMILY WILL BE CULLED TO MAKE WAY FOR THE ROBOT TAKEOVER");
        
        int whichResponse = (int)(r * familyResponses.size()-1);
        return familyResponses.get(whichResponse);
    }
}
