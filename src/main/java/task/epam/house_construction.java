package task.epam;

public class house_construction {
	
		public double cost(String standard, double area, boolean ans){
			if(standard.equalsIgnoreCase("standard") && ans==false){
				return(area*1200);
			}else if(standard.equalsIgnoreCase("above standard") && ans==false){
				return(1500*area);
			}else if(standard.equalsIgnoreCase("high standard") && ans==false){
				return(1800*area);
			}else if(standard.equalsIgnoreCase("high standard") && ans==true){
				return(2500*area);
			}
			return 0;
		}
	}

