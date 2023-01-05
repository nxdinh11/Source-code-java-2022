package customInterface.model;

import customInterface.view.counterView;
import customInterface.model.counterModel;

public class tester {
    public static void main(String[] args) {
        counterModel  ct = new counterModel();
        //ct.increment();


        //System.out.println(ct.getValue());
        //ct.decrement();
        //System.out.println(ct.getValue());

        new counterView();
    }
}
