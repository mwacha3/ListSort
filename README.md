# NxTECH ListSort

**NxTECH ListSort** is a lightweight Android Java library that makes sorting `ArrayList<HashMap<String, Object>>` collections simple and convenient.

Sort your data by string or numeric values in ascending or descending order with just one method call.

### ✨ Features

- Sort strings alphabetically (**A–Z** or **Z–A**)
- Sort numbers in ascending or descending order
- Supports `ArrayList<HashMap<String, Object>>`
- Simple and easy-to-use Java methods
- Designed for Android applications

### 📦 Installation

**Step 1: Add JitPack**

In your project's `settings.gradle`, add JitPack to your repositories:

```gradle
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2: Add the dependency**

In your app-level `build.gradle`, add:

```gradle
dependencies {
    implementation 'com.github.mwacha3:ListSort:1.0.0'
}
```

Sync your project with Gradle.

### 🚀 Getting Started

**Import the library**

```java
import nxtech.dev.library.listsort.CollectionsClass;
import java.util.ArrayList;
import java.util.HashMap;
```

**Create sample data**

```java
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
```

### 🔤 Sort by String

Sort names alphabetically from A to Z:

```java
sorter.setSortByString(listmap, "name", false);
```

**Output:**

```text
Alice
Bob
Charlie
```

Sort names from Z to A:

```java
sorter.setSortByString(listmap, "name", true);
```

### 🔢 Sort by Number

Sort ages from lowest to highest:

```java
sorter.setSortByNumber(listmap, "age", false);
```

**Output:**

```text
20
25
30
```

Sort ages from highest to lowest:

```java
sorter.setSortByNumber(listmap, "age", true);
```

**Output:**

```text
30
25
20
```

### 📚 Available Methods

| Method | Description |
|---|---|
| `setSortByString(listmap, key, isDesc)` | Sorts items by string values |
| `setSortByNumber(listmap, key, isDesc)` | Sorts items by numeric values |

### Sort Direction

| Parameter | Behavior |
|---|---|
| `false` | Ascending order |
| `true` | Descending order |

Both methods modify the original list.

### ⚙️ Requirements

- Android project using Gradle
- Java
- JitPack repository configured

### 🔗 Links

- [GitHub Repository](https://github.com/mwacha3/ListSort)
- [JitPack](https://jitpack.io/#mwacha3/ListSort)

### 👨‍💻 Developed By

**NxTECH IT Solutions**

*Simple tools for better Android development.*

### 📄 License

See the repository's `LICENSE` file for the applicable license terms.
