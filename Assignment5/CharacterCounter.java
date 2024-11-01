
/**
 * CharacterCounter
 * 
 * 1. This program reads in characters from a file (args[0]) and keeps
 *    track (using an array of size 128) of number of times each character appears in a file.
 * 2. Then, the program writes to the output file (args[1]) from index 32 to 126 inclusive:
 *    [character], [ascii value], [number of times the character appears in the file], [frequency]
 * 
 * @author Mary Buist
 * @author Anna Lu
 */
public class CharacterCounter {

    public static void main(String[] args) {

	// Do not remove this line, it opens the file for reading.
	// Use StdIn.readChar() to read from the file.
	StdIn.setFile(args[0]);

	// Do not remove this line, it opens the file for writing.
	// Use StdOut.println(), StdOut.print(), or StdOut.printf() to write to the file.
	StdOut.setFile(args[1]);
	
	// WRITE YOUR CODE HERE
	char[] letters = new char[128];
	int count = 0;
	char[] fileSave = new char[99999999];
	char x;
	while (StdIn.hasNextChar()) {
		x = StdIn.readChar();
		count++;
		fileSave[count]=x;
	}

	
	for (int i = 0; i<letters.length; i++){
		int k = 0;
		letters[i]=((char)(i));
		for (int j = 0; j<=count; j++) {
			
			if (letters[i] == fileSave[j]) {
					k++;
			}
			
			
		}
		if(i>=32&&i<=126) {
			double rate = 100*((double)(k))/((double)(count));
			StdOut.println(letters[i] + "," + i + "," + k + "," +rate);
		}
		// if (i>=32&&i<=126) {
		// 	StdOut.println("[" + letters[i] + "],[" + i + "],[" + k + "],[" + (((double)(k/count))*100) + "]"	);
		// }
	}
	
	// while(StdIn.hasNextChar()){
		
	// 	count++;
		
	// }
	// System.out.println("Done");
	// for (int i=0; i>=letters.length;i++){
	// 	if (i>36) {

	// 	}
	// 	for (int j=0; j>=letters.length;j++){
	// 		if (letters[i]==letters[j]) {
	// 			StdOut.print()
	// 		}
	// 	}
		
	// }


    }
	
}
