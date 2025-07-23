package practice;

class Private_Specifire {
	    private int x;
	    private int y;
	    
	    public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		private void show() {
	    	System.out.println("X:" + x);
	    	System.out.println("Y: " + y);
	    }
	    public static void main(String[] args) {
	    	Private_Specifire ps = new Private_Specifire();
	    	ps.setX(10);
	    	ps.setY(20);
	    	ps.show();
	    	System.out.println("First Number is: " + ps.getX());
	    	System.out.println("Second Number is: " + ps.getY());
	    	
	    
	    }
	    
}