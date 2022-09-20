package sprint4.assignment.question_2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        int amt = sc.nextInt();
        Hotel res = provideFood(amt);
    }

    public static Hotel provideFood(int amount){
        Hotel hotel = new TajHotel();
        Hotel hotel1 = new RoadSideHotel();
        if(amount > 1000){
            return hotel;
        }else if(amount > 200 && amount < 1000){
            return hotel1;
        }

        return null;
    }
}

interface Hotel{
    void chickenBiryani();
    void masalaDosa();
}

class TajHotel implements Hotel{
    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }
    @Override
    public void chickenBiryani() {
        System.out.println("Chicken Biryani from the TajHotel");

    }

    @Override
    public void masalaDosa() {
        System.out.println("Masala Dosa from the TajHotel");
    }
}

class RoadSideHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Chicken Biryani from the Roadside Hotel");

    }

    @Override
    public void masalaDosa() {
        System.out.println("Masala Dosa from the Roadside Hotel");
    }
}