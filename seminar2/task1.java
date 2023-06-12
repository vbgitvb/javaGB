/*
1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/

/**
 * task1
 */
public class task1 {

    public static StringBuilder createSqlRequest(String dbName, String sqlRequest, String sqlFilter, String sqlExpression ) {

        StringBuilder sqlFullRequest = new StringBuilder("");
        String useDB = "use db.";
        String charsToRemove = "{}\"";
        String delimiter = ":";

        if(!(sqlRequest.contains(dbName))){
            sqlFullRequest.append(useDB + dbName+ " ");
        }
        
        sqlFullRequest.append(sqlRequest + " ");

        for (char c : charsToRemove.toCharArray()) {
            sqlFilter = sqlFilter.replace(String.valueOf(c), "");
        }

        String[] dbRecord = sqlFilter.split(",");

//        System.out.println(sqlFullRequest);
        for (int i = 0; i< dbRecord.length; i++) {
            String[] keyValue = dbRecord[i].trim().split(delimiter);
                if(!(keyValue[1].equalsIgnoreCase("null"))){
                    if (i != 0){
                        sqlFullRequest.append(sqlExpression + " ");
                    }
                    sqlFullRequest.append(keyValue[0] + "='" + keyValue[1] + "' ");
                }
        }
        return (sqlFullRequest);
    }


    
    public static void main(String[] args) {
        
        String strRequest = "select * from students where ";
        String strFilters = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String strConjunction = "AND";
        String nameOfDB = "main";
        System.out.println(strRequest);
        System.out.println(strFilters);
        System.out.println("\n" + createSqlRequest(nameOfDB, strRequest, strFilters, strConjunction));
    }
}