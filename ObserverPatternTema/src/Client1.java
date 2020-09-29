public  class Client1 implements Client{


    @Override
    public void updateStoc(String subscribeStoc) {
        System.out.println(" Client 1  -----" + subscribeStoc);
    }

    @Override
    public void updatePret(String subscribePret) {
        System.out.println(" Client 1  -----" +subscribePret);
    }

    @Override
    public void numeProdus(String numeProdus) {
        System.out.println("Client 1 ------" );

    }



}
