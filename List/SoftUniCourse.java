package List_exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        
        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            String[] inputCommands = input.split(":");
            String commands = inputCommands[0];
            String lessonTitle = inputCommands[1];
            switch (commands) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(inputCommands[2]);
                    if (!schedule.contains(lessonTitle)) {
                        if (index >= 0 && index < schedule.size()) {
                            schedule.add(index, lessonTitle);
                        }
                    }
                    break;
                case "Remove":
                    schedule.remove(lessonTitle);
                    schedule.remove(lessonTitle + "-Exercise");
                    break;
                case "Swap":
                    String swapWithLesson = inputCommands[2];
                    String firstLessonExercise = lessonTitle + "-Exercise";
                    String secondLessonExercise = swapWithLesson + "-Exercise";
                    if (schedule.contains(lessonTitle) && schedule.contains(swapWithLesson)) {
                        int lessonTitleIndex = schedule.indexOf(lessonTitle);
                        int swapWithLessonIndex = schedule.indexOf(swapWithLesson);
                        Collections.swap(schedule, lessonTitleIndex, swapWithLessonIndex);
                        //   schedule.add(swapWithLessonIndex, lessonTitle);
                        //  schedule.remove(swapWithLesson);
                        //  schedule.remove(lessonTitle);
                        //   schedule.add(lessonTitleIndex, swapWithLesson);
                    }
                    if (schedule.contains(firstLessonExercise)) {
                        schedule.remove(firstLessonExercise);
                        schedule.add(schedule.indexOf(lessonTitle) + 1, firstLessonExercise);
                    }
                    if (schedule.contains(secondLessonExercise)) {
                        schedule.remove(secondLessonExercise);
                        schedule.add(schedule.indexOf(swapWithLesson) + 1, secondLessonExercise);
                    }
                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    if (schedule.contains(lessonTitle) && !schedule.contains("exercise")) {
                        schedule.add(schedule.indexOf(lessonTitle) + 1, exercise);
                    } else if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 1; i <= schedule.size(); i++) {
            System.out.println(i + "." + schedule.get(i - 1));
        }
    }
}
