/* 用「斜線、星號」、「星號、斜線」包住的區塊為多行註解 */
/** @file Main_program.java
    @brief 「Java 程式設計世界哈囉！」主程式
    @author Ｖ字龍(Vdragon)
    @copyright Ｖ字龍放棄此專案的一切權利，將其釋出到公有領域(public domain)。 */

/* For I18N support */
import java.util.Locale;
import java.util.ResourceBundle;

/** Main_program 物件類別(class)

    每個 Java 來源程式碼檔案至少要有一個 public 物件類別 */
public class Main_program{
	/** public static void main() 為 Java 程式的進入點(entry point)子程式
	 *  @param args 保存命令列參數的字串陣列，注意第一個命令列參數位於 0 索引值，本程式目前沒有實際用到此參數。 */
	public static void main(String[] args){
		ResourceBundle translation = ResourceBundle.getBundle("Resources/Translations/Messages", Locale.getDefault());
	
		/* 呼叫標準輸出(standard output)(System.out)物件的負責輸出字串的 println 方法(method) 以輸出「Java 程式設計世界哈囉！」字串 */
		System.out.println(translation.getString("greeting_statement"));
		
	}
}
