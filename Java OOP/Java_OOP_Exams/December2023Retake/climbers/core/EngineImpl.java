package Java_OOP_Exams.December2023Retake.climbers.core;

import Java_OOP_Exams.December2023Retake.climbers.common.Command;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class EngineImpl implements Engine{
    private final Controller controller;
    private final Scanner scanner;

    public EngineImpl(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }



    @Override
    public void run() {
        while (true) {
            String result = null;
            try {
                result = processInput();

                if (result.equals(Command.Exit.name())) {
                    break;
                }
            } catch (NullPointerException | IllegalArgumentException | IOException e) {
                result = e.getMessage();
            }

            System.out.println(result);
        }
    }

    private String processInput() throws IOException {
        String input = this.scanner.nextLine();
        String[] tokens = input.split("\\s+");

        Command command = Command.valueOf(tokens[0]);
        String result = null;
        String[] data = Arrays.stream(tokens).skip(1).toArray(String[]::new);

        switch (command) {
            case AddClimber:
                result = addClimber(data);
                break;
            case AddMountain:
                result = addMountain(data);
                break;
            case RemoveClimber:
                result = removeClimber(data);
                break;
            case StartClimbing:
                result = startClimbing(data);
                break;
            case GetStatistics:
                result = getStatistics();
                break;
            case Exit:
                result = Command.Exit.name();
                break;
        }

        return result;
    }

    private String addClimber(String[] data) {
        return controller.addClimber(data[0], data[1]);
    }

    private String addMountain(String[] data) {
        String mountainName = data[0];
        String[] peak = Arrays.stream(data).skip(1).toArray(String[]::new);
        return controller.addMountain(mountainName, peak);
    }
    private String removeClimber(String[] data) {
        return controller.removeClimber(data[0]);
    }

    private String startClimbing(String[] data) {
        return controller.startClimbing(data[0]);
    }
    private String getStatistics() {
        return controller.getStatistics();
    }



}
