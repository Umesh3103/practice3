//Welcome message

public class SnakeLadderWelcome{
	public static void main(String[] args){
		System.out.println("Welcome to snake and ladder problem");
	}
}

//  Player start position

public class SnakeLadderUC1{
	public static void main(String[] args){
		int START_POSITION = 0;
	}
}

// Rolling the dice
public class SnakeLadderUC2{
	public static void main(String[] args) {
		int n =(int) (Math.floor(Math.random() *10) %6)+1;
	}
}

// Player checks for multiple options

public class SnakeLadderUC3{
	public static void main(String[] args){
		int START_POSITION =0;
		int Die_Number= (int) (Math.floor(Math.random() *10) %6)+1;
		int NO_PLAY=0, LADDER =1, SNAKE=2;
		int Check_Option = (int) (Math.floor(Math.random() *10) %3);
		int Player_Position=0;
		
		if(Check_Option == NO_PLAY){
			Player_Position= Player_Position;
		}
		else if(Check_Option == LADDER){
			Player_Position = Player_Position + Die_Number;
		}
		else{
			Player_Position = Player_Position - Die_Number;
		}
	}
}

// Checking for winning position


public class SnakeLadderUC4{
        public static void main(String[] args){
                int START_POSITION =0;
                
                int NO_PLAY=0, LADDER =1, SNAKE=2;
                int Die_Number,Check_Option;
                int Player_Position=START_POSITION;

		while(Player_Position < 100){
			Die_Number= (int) (Math.floor(Math.random() *10) %6)+1;
			Check_Option = (int) (Math.floor(Math.random() *10) %3);
                	if(Player_Position < 0){
                        	Player_Position= START_POSITION;
                	}
                	else if(Check_Option == LADDER){
                        	Player_Position += Die_Number;
                	}
                	else if(Check_Option == SNAKE){
                        	Player_Position -= Die_Number;
                	}
		}
        }
}

// Checking for exact winning position

public class SnakeLadderUC5{
	public static void main(String[] args){
        	int START_POSITION =0;
        	int NO_PLAY=0, LADDER =1, SNAKE=2;
		int Player_Position=START_POSITION;

        	while(Player_Position <= 100){
        		int Die_Number= (int) (Math.floor(Math.random() *10) %6)+1;
        	
        		int Check_Option = (int) (Math.floor(Math.random() *10) %3);
        	
                	if(Player_Position < 0){
                        	Player_Position= START_POSITION;
                	}
			else if(Player_Position == 100){
				break;
			}
                	else if(Check_Option == LADDER){
                        	Player_Position += Die_Number;
				if(Player_Position >100){
					Player_Position -= Die_Number;
				}
                	}
                	else if(Check_Option ==SNAKE){
                        	Player_Position -= Die_Number;
                	}
        	}
        
	}
}
