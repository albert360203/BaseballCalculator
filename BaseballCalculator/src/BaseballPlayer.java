
public class BaseballPlayer {
	
	private String PlayerName;
	private int AB;
	private int H;
	private int _2B;
	private int _3B;
	private int HR;
	private int R;
	private int BB;
	private int HBP;
	private int SF;
	
	

	public BaseballPlayer(String playerName, int aB, int h, int _2b, int _3b, int hR, int r, int bB, int hBP, int sF) {
		super();
		PlayerName = playerName;
		AB = aB;
		H = h;
		_2B = _2b;
		_3B = _3b;
		HR = hR;
		R = r;
		BB = bB;
		HBP = hBP;
		SF = sF;
	}


	
	

	public String getPlayerName() {
		return PlayerName;
	}







	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}







	public int getAB() {
		return AB;
	}







	public void setAB(int aB) {
		AB = aB;
	}







	public int getH() {
		return H;
	}







	public void setH(int h) {
		H = h;
	}







	public int get_2B() {
		return _2B;
	}







	public void set_2B(int _2b) {
		_2B = _2b;
	}







	public int get_3B() {
		return _3B;
	}







	public void set_3B(int _3b) {
		_3B = _3b;
	}







	public int getHR() {
		return HR;
	}







	public void setHR(int hR) {
		HR = hR;
	}







	public int getR() {
		return R;
	}







	public void setR(int r) {
		R = r;
	}







	public int getBB() {
		return BB;
	}







	public void setBB(int bB) {
		BB = bB;
	}







	public int getHBP() {
		return HBP;
	}







	public void setHBP(int hBP) {
		HBP = hBP;
	}







	public int getSF() {
		return SF;
	}







	public void setSF(int sF) {
		SF = sF;
	}







	public double CalculateBA()
	{
		return ((double)H/AB);
	}
	
	public double CalculateOBP()
	{
		return ((double)(H+BB+HBP)/(AB+BB+HBP+SF));
	}
	
	public double CalculateSLG()
	{
		return ((double)CalculateTB()/(AB));
	}
	
	public double CalculateOBS()
	{
		return ((double) this.CalculateOBP()+this.CalculateSLG());
	}
	
	public int CalculateTB()
	{
		return (H-_2B-_3B-HR)+2*_2B+3*_3B+4*HR;
	}

}
