public class ScienceExperiment {
  public static void main(String[] args) {
    // Create an array to store the results of our experiment
    int[] results = new int[5];

    // Run the experiment 10 times and collect the results
    for (int i = 0; i < 10; i++) {
      results[i] = simulateExperiment();
    }

    // Print the results of our experiment to the console
    System.out.println("Results of Experiment:");
    for (int result : results) {
      System.out.println(result);
    }
  }

  private static int simulateExperiment() {
    // Simulate an experiment by randomly generating numbers between 1 and 10
    return (int)(Math.random() * 10 + 1);
  }
}
