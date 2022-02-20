package cz.educanet.praha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ILanderControls controls = new BurnFuel();

        System.out.println("Zadej altitude: ");
        int altitude = sc.nextInt();
        System.out.println("Zadej velocity: ");
        int velocity = sc.nextInt();



        // TODO set controls
        try {
            final var lander = new LunarLanding(
                    controls,
                    altitude,
                    velocity
            );
            System.out.println("Total amount of fuel: " + lander.land());
            System.out.println(controls.getSecondsOfFuelBurn(altitude, velocity));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
