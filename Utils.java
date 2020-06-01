public class Utils {

  /**
   * Returns a copy of the array 'in' where each word occurring in the array
   * 'what' has been replaced by the word occurring in the same position
   * in the array 'with'.
   *
   * @param in an array of Strings;
   * @param what an array of words to be replaced;
   * @param with an array of replacement words;
   * @return a new array idententical to 'in' except that all the occurrences of words
   * found in 'what' have been replaced by the corresponding word from 'with'.
   */
  public static String[] findAndReplace(String[] in, String[] what, String[] with) {
    String[] out = null; // The new array to be returned
    boolean valid = true; // True if the pre-conditions are satistified

  	// Testing pre-conditions

  	if ( in == null || what == null || with == null ) {
  	    valid = false;
  	} else {
  	    for(int i=0, i<in.length;i++){
          if(in[i]==null){
            valid = false;
            break;
          }
  	}
    for(int i=.0;i<what.length;i++){
      if(what[i]==null){
        valid = false;
        break;
      }
      
    for(int i=0;i<with.length;i++){
      if(with[i]==null){
        valid = false;
        break;
      }
    }
  	if ( valid ) {
  	    out = new String[ in.length ];
  	    for ( int i=0; i<in.length; i++ ) {
          concat=concat.trim().replaceALL(what[i],with[i]):
        }
      the concat string
        out=concat.split(" ");
  		      
  	    }
    return out;
  }
}
