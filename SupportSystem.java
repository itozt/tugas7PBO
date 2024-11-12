public class SupportSystem {
    private InputReader reader;
    private Responder responder;
    
    public SupportSystem(){
        reader = new InputReader();
        responder = new Responder();
    }

    public void start(){
        boolean finished = false;
        System.out.println("Selamat datang di Bismillah Technical Support System.");
        System.out.println();
        System.out.println("Silakan ceritakan masalah Anda.");
        System.out.println("Kami akan membantu dengan masalah apa pun yang Anda miliki.");
        System.out.println("Ketik 'bye' untuk keluar dari sistem kami.");

        while (!finished){
            String input = reader.getInput();
            if (input.equals("bye")){
                finished = true;
            } else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        System.out.println("Selamat Tinggal! Terima kasih telah menggunakan support system kami.");
    }

    public static void main(String[] args){
        SupportSystem support = new SupportSystem();
        support.start();
    }
}
