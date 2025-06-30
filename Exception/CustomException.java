package Exception;
class CustomException extends Exception{
	void show() {
		System.out.println("Exception Ayuu");
	}

    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	try {
    		CustomException e1 = new CustomException();
    		throw e1;
    		
    	}catch(CustomException e) {
    		e.show();
    	}
    	System.out.println("Rest of the code..");	
    }
    }

