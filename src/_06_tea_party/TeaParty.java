package _06_tea_party;

public class TeaParty {
	  
	
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		
		if(isWoman&&isKnighted) {
			return "Hello Lady " + name;
		}
		if(!isWoman&&isKnighted) {
			return "Hello Sir " + name;
		} 
		if(isWoman&&!isKnighted) {
			return "Hello Ms. " + name;
		}
		if(!isWoman&&!isKnighted) {
			return "Hello Mr. " + name;
		}
		
		
			return null;
	    }
	}

