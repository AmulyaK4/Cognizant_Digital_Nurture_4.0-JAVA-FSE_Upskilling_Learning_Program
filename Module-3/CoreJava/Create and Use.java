// In com.utils module
// module-info.java
module com.utils {
    exports com.utils;
}

// In com.greetings module
// module-info.java
module com.greetings {
    requires com.utils;
}

// com.utils.Utility.java
package com.utils;

public class Utility {
    public static String getMessage() {
        return "Hello from Utility!";
    }
}

// com.greetings.Main.java
package com.greetings;

import com.utils.Utility;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utility.getMessage());
    }
}
