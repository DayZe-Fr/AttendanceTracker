import dev.DayZe.View.*;
import dev.DayZe.tools;
import dev.DayZe.Controller.*;
import dev.DayZe.Database.*;
//import dev.DayZe.DAO.*;
//import dev.DayZe.Model.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static tools _tools;


    // UI Components
    private static GUI _mainGUI;

    // config Items
    private static String _configFile;
    private static String[] _configLines;
    private static Map<String, String> _configArgs;

    //  Controller Items
    private static signInController _signInController;

    // Database
    private static Database _Database;




    public static void main(String[] args) {
        _tools = new tools();
        //getting config file
        _configArgs = new HashMap<String, String>();
        try {
            _configFile = Files.readString(Path.of("src/dev/DayZe/View/Config.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        _configLines = _configFile.split(";");

        for (String configLine : _configLines) {
            String[] part = configLine.split("->");
            _configArgs.put(part[0].trim(), part[1].trim());
        }

        tools.print(_configArgs.get("width"));

        // will validate the input later.

        // ====================================
        //creating GUI
        _mainGUI = new GUI(Integer.parseInt(_configArgs.get("height")), Integer.parseInt(_configArgs.get("width")));

        //creating db
        _Database = new Database(_tools);

        //creating signin controller
        _signInController = new signInController(_tools, _mainGUI);














    }
}