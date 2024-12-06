import java.io.*;

public class FileCompression {
    public static void main(String[] args) {
        // Print the current working directory for debugging purposes
        System.out.println("Working Directory: " + System.getProperty("user.dir"));

        // Define input and output file paths
        File inputFile = new File("data.txt");  // Input file (must exist in the working directory)
        File outputFile = new File("CompressedData.txt");  // Output file (will be created or overwritten)

        try {
            // Call the method to compress the file
            compressFile(inputFile, outputFile);
            System.out.println("File compression completed."); // Indicate success
        } catch (IOException e) {
            // Handle exceptions and display error messages
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    /**
     * Compresses a file by removing all whitespace and writes the result to another file.
     * @param inputFile  The file to be compressed
     * @param outputFile The file to write the compressed data to
     * @throws IOException If an I/O error occurs
     */
    public static void compressFile(File inputFile, File outputFile) throws IOException {
        // Check if the input file exists; throw an exception if not
        if (!inputFile.exists()) {
            throw new FileNotFoundException("Input file not found: " + inputFile.getAbsolutePath());
        }

        // Open the input file for reading and the output file for writing
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;  // Variable to hold each line read from the input file

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Debug: Print the original line for reference
                System.out.println("Original line: " + line);

                // Remove all whitespace from the line
                String compressedLine = line.replaceAll("\\s+", "");

                // Debug: Print the compressed line for reference
                System.out.println("Compressed line: " + compressedLine);

                // Write the compressed line to the output file
                writer.write(compressedLine);

                // Add a line break to preserve line structure in the output file
                writer.newLine();
            }

            // Ensure all buffered data is written to the output file
            writer.flush();
        }
    }
}
/*THIS PROJECT IS INCOMPLETE. I struggled for a wide majority of this project*/
/*I used many different resources and help to get what I have currently. I used much of W3 Schools*/
/*and Geeks for Geeks. I also got help from Jack B. on some other aspects of this project.*/
/*I ultimately gave up on this project because I kept running into the "File not found" error and*/
/*wasn't able to figure it out. I commented out the lines of code with a brief explanation of what I wanted it to execute. Especially now that I would like to get started on my final project*/
/*I tried to get to the bottom of the problems in this project, but it never worked out how I wanted*/
