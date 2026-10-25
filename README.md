#NxTECH ListSort

A lightweight Android Java library for sorting "ArrayList<HashMap<String, Object>>" collections by string or numeric values.

Features

- Sort by string values (A–Z or Z–A).
- Sort by numeric values (ascending or descending).
- Works with Java "ArrayList<HashMap<String, Object>>".
- Simple API with no additional setup beyond adding the dependency.
- Compatible with Android projects using Java.

Installation

1. Add the JitPack repository

In your project's "settings.gradle" file, add JitPack under "dependencyResolutionManagement":

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}

Keep any other repositories already required by your project.

2. Add the dependency

In your app-level "build.gradle" file, add:

dependencies {
    implementation 'com.github.mwacha3:ListSort:1.0.0'
}

Sync your project with Gradle.

Import

import nxtech.dev.library.listsort.CollectionsClass;
import java.util.ArrayList;
import java.util.HashMap;

Usage

Create a list containing "HashMap" items:

ArrayList<HashMap<String, Object>> listmap =
        new ArrayList<HashMap<String, Object>>();

HashMap<String, Object> item1 = new HashMap<String, Object>();
item1.put("name", "Charlie");
item1.put("age", 30);
listmap.add(item1);

HashMap<String, Object> item2 = new HashMap<String, Object>();
item2.put("name", "Alice");
item2.put("age", 20);
listmap.add(item2);

HashMap<String, Object> item3 = new HashMap<String, Object>();
item3.put("name", "Bob");
item3.put("age", 25);
listmap.add(item3);

CollectionsClass sorter = new CollectionsClass();

Sort strings: A–Z

sorter.setSortByString(listmap, "name", false);

Expected order:

Alice
Bob
Charlie

Sort strings: Z–A

sorter.setSortByString(listmap, "name", true);

Sort numbers: lowest to highest

sorter.setSortByNumber(listmap, "age", false);

Expected order:

20
25
30

Sort numbers: highest to lowest

sorter.setSortByNumber(listmap, "age", true);

Expected order:

30
25
20

Available methods

Method| Description
"setSortByString(listmap, key, isDesc)"| Sorts items by a string field.
"setSortByNumber(listmap, key, isDesc)"| Sorts items by a numeric field.

The "isDesc" parameter controls the sort direction:

- "false" — ascending order.
- "true" — descending order.

Both methods sort the supplied list directly, changing its order.

Requirements

- Android project using Gradle.
- Java.
- JitPack repository configured in the project.

Repository

"GitHub — NxTECH ListSort" (https://github.com/mwacha3/ListSort)

Author

NxTECH IT Solutions

License

Check the repository's "LICENSE" file for the applicable license terms.
