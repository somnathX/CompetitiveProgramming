import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    static BufferedReader br;
    static PrintWriter out;
	static int MOD=1000000007;
	static ArrayList<Integer>[] graph;
	static Vector<String> v;
	static void solve() throws Exception{
		int n=ni();
		Set<String> st=new TreeSet<String>();
		while(n-->0){
			st.add(ns());
		}
		Iterator<String> it=st.iterator();
		while(it.hasNext()){
			out.println(it.next());
		}
	}
	private static String ns() throws Exception{
		int b=skip();
		StringBuilder sb=new StringBuilder();
		while(!isSpaceChar(b)){
			sb.appendCodePoint(b);
			b=br.read();
		}
		return sb.toString();
	}
	private static boolean isSpaceChar(int c){
		return !(c>=33&&c<=126);
	}
	private static int skip() throws Exception{
		int b=0;
	    while(((b=br.read())!=-1)&&isSpaceChar(b));
		return b;
	}
	private static int[] na(int n) throws Exception{
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=ni();
		}
		return arr;
	}
	private static long[] na(int n,char c) throws Exception{
		long[] arr=new long[n];
		for(int i=0;i<n;i++){
			arr[i]=nl();
		}
		return arr;
	}
	private static int ni() throws Exception{
		int num=0;
		int b;
		boolean minus=false;
		while(((b=br.read())!=-1)&&!((b>='0'&&b<='9')||b=='-'));
		if(b=='-'){
			minus=true;
			b=br.read();
		}
		while(true){
			if(b>='0'&&b<='9'){
				num=num*10+b-'0';
			}
			else{
				return minus?-num:num;
			}
			b=br.read();
		}
	}
	private static long nl() throws Exception{
		long num=0;
		int b;
		boolean minus=false;
		while(((b=br.read())!=-1)&&!((b>='0'&&b<='9')||b=='-'));
		if(b=='-'){
			minus=true;
			b=br.read();
		}
		while(true){
			if(b>='0'&&b<='9'){
				num=num*10+b-'0';
			}
			else{
				return minus?-num:num;
			}
			b=br.read();
		}
	}
	public static void main(String[] args) throws Exception{
		br=new BufferedReader(new InputStreamReader(System.in));
		out=new PrintWriter(System.out);
		solve();
		out.close();
		return ;
	}
}
