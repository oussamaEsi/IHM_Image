package ihm_image_medical;

public class AES_opr {

	private int keysizecheck = 128;
	private int[][] state, initvector = new int[4][4];

	
	public String encryption(AES aes,String Msg,String key){
		int numRounds = 10 + (((key.length() * 4 - 128) / 32));
		int[][] keymatrix = aes.keySchedule(key);
		state = new int[4][4];
        for (int i = 0; i < 4; i++) //Parses line into a matrix
        {
            for (int j = 0; j < 4; j++) {
                state[j][i] = Integer.parseInt(Msg.substring((8 * i) + (2 * j), (8 * i) + (2 * j + 2)), 16);
            }
        }
        aes.addRoundKey(state, aes.subKey(keymatrix, 0)); //Starts the addRoundKey with the first part of Key Expansion
       
        for (int i = 1; i < numRounds; i++) {
        	aes.subBytes(state); //implements the Sub-Bytes subroutine.
            aes.shiftRows(state); //implements Shift-Rows subroutine.
            aes.mixColumns(state);
            aes.addRoundKey(state,aes.subKey(keymatrix, i));
        }
        aes.subBytes(state); //implements the Sub-Bytes subroutine.
        aes.shiftRows(state); //implements Shift-Rows subroutine.
        aes.addRoundKey(state, aes.subKey(keymatrix, numRounds));
        
            initvector = state;
       // out.write(MatrixToString(state) + newline); //If all systems could just use the same newline, I'd be set.
            String s=aes.MatrixToString(state);
        return s;
	}
	
	public String decryption(AES aes,String Msg,String key){
		int numRounds = 10 + (((key.length() * 4 - 128) / 32));
        state = new int[4][4];
        initvector = new int[4][4];
        int[][] nextvector = new int[4][4];
        int[][] keymatrix = aes.keySchedule(key);
        
            state = new int[4][4];
            for (int i = 0; i < state.length; i++) //Parses line into a matrix
            {
                for (int j = 0; j < state[0].length; j++) {
                    state[j][i] = Integer.parseInt(Msg.substring((8 * i) + (2 * j), (8 * i) + (2 * j + 2)), 16);
                }
            }
            
            aes.addRoundKey(state, aes.subKey(keymatrix, numRounds));
            for (int i = numRounds - 1; i > 0; i--) {                        	
            	aes.invShiftRows(state);
                aes.invSubBytes(state);
                aes.addRoundKey(state, aes.subKey(keymatrix, i));
                aes.invMixColumns(state);
            }
            aes.invShiftRows(state);
            aes.invSubBytes(state); 
            aes.addRoundKey(state, aes.subKey(keymatrix, 0));
            
            
            String s = aes.MatrixToString(state);
            return s;
	}
}
