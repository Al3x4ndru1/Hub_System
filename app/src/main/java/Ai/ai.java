package Ai;


import android.view.View;

import com.example.myapplication.MainActivity;

public class ai {
    public static void main(String[] args){
        String s= "anxious and anxiety and depressed";
        aici(s);
    }

    public static void aici(String s) {

        int autismcount = 0;
        int adhdcount = 0;
        int dyslescount = 0;

        String[] output = s.split(" ");
        for (String str : output) {

            String result_autism = null;
            String result_adhd = null;
            String result_dys = null;
            try {
                result_adhd = String.valueOf(Adhd.valueOf(str));
                result_autism = String.valueOf(Autism.valueOf(str));
                result_dys = String.valueOf(Dyslexsia.valueOf(str));

            } catch (IllegalArgumentException e) {
                System.out.println("Erore");

            }
            if (result_adhd != null) {
                adhdcount++;
            }
            if (result_autism != null) {
                autismcount++;
            }
            if (result_dys != null) {
                dyslescount++;
            }
        }
        int max = Math.max(adhdcount, Math.max(dyslescount, autismcount));
        System.out.println(max);
        if (max == dyslescount) {
            View view = null;
            //new activity(view);
            System.out.println("Dyslecsic");
        } else {
            if (max == autismcount) {
                System.out.println("Autist");
            } else {
                System.out.println("ADHD");
                MainActivity a = new MainActivity();
                a.ADHD();
            }
        }
    }



    public static void stars(float s,float s1, float s2){

        if((s+s1+s2)/3.0<=1.3){
            System.out.println("Chat only");
        }
            else{
            if((s+s1+s2)/3.0<=2.2){
                System.out.println("Option");
            }else {
                System.out.println("Profesional");
            }

            }
    }

}


