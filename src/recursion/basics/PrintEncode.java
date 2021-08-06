package recursion.basics;

public class PrintEncode {
    public static void main(String args[]){
//        encoding("12103","");
        printEncoding("123","");
    }
    public static void encoding(String question,String ans){
        if(question.length()==0){
            System.out.println(ans);
            return;
        }
        else if(question.length()==1){
            char ch=question.charAt(0);
            if(ch=='0'){
                return;
            }
            else{
                int chv=ch-'0';
                char code =(char)('a'+chv-1);
                ans+=code;
                System.out.println(ans);
            }
        }
        else if(question.length()>=2){
            char ch =question.charAt(0);
            String ros=question.substring(1);
            if(ch=='0'){
                return;
            }
            else{
                int chv=ch-'0';
                char code =(char)('a'+chv-1);
                encoding(ros,ans+code);
            }

            String ch12=question.substring(0,2);
            String roq=question.substring(2);
            int chv12=Integer.parseInt(ch12);
            if(chv12<=26){
                char code =(char)('a'+chv12-1);
                encoding(roq,ans+code);
            }

        }

    }

    public static void printEncoding(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        else if(ques.length()==1){
            char ch=ques.charAt(0);
            if(ch=='0'){
                return;
            }
            else{
                int chv=ch-'0';
                char ch1=(char)('a'+chv-1);
                ans+=ch1;
                System.out.println(ans);
            }
        }
        else if(ques.length()>=2){
            char ch=ques.charAt(0);
            String ros=ques.substring(1);
            if(ch=='0'){
                return;
            }
            else{
                int chv=ch-'0';
                char ch1=(char)('a'+chv-1);
                printEncoding(ros,ans+ch1);
            }
            String ch12=ques.substring(0,2);
            String roq=ques.substring(2);
            int chv12=Integer.parseInt(ch12);
            if(chv12<=26){
                char chvv12=(char)('a'+chv12-1);
                   printEncoding(roq,ans+chvv12);

            }
        }
    }
}
