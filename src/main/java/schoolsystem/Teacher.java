package schoolsystem;

import java.util.HashMap;
import java.util.Map;

public class Teacher {
    static Map<String, String> teacherMap = new HashMap<>();
    public static void addTeacher() {
        teacherMap.put("123456987411", "Ali, Can, 1980, Matematik");
        teacherMap.put("123456987412", "Veli, Yan, 1981, Fizik");
        teacherMap.put("123456987413", "Ayse, Can, 1982, Kimya");
        teacherMap.put("123456987414", "Ali, San, 1983, Kimya");
        teacherMap.put("123456987415", "Alp, Yan, 1984, Matematik");

    }
}
