# Pizza App - Website

A Java Swing desktop application for a pizza ordering website. Users can sign up, log in, browse the menu, add items to a cart, and place orders.

## Screenshots

> Login Page · Home Page · Order Page · Cart · Payment

## Prerequisites

- Java JDK 8 or higher — [Download](https://www.oracle.com/java/technologies/downloads/)
- NetBeans IDE 12+ (recommended) — [Download](https://netbeans.apache.org/front/main/download/)
- PostgreSQL — [Download](https://www.postgresql.org/download/)

## Database Setup

1. Install and start PostgreSQL.
2. Open pgAdmin or psql and create the database table:

```sql
CREATE TABLE websitedatabase (
    id       SERIAL PRIMARY KEY,
    name     VARCHAR(100),
    email    VARCHAR(100),
    password VARCHAR(100),
    address  VARCHAR(200),
    sex      VARCHAR(10),
    username VARCHAR(50),
    state    VARCHAR(50)
);
```

3. Set the following environment variables so the app can connect to your database:

| Variable | Description               | Default                              |
|----------|---------------------------|--------------------------------------|
| DB_URL   | JDBC connection URL       | `jdbc:postgresql://localhost:5432/postgres` |
| DB_USER  | PostgreSQL username       | `postgres`                           |
| DB_PASS  | PostgreSQL password       | *(empty)*                            |

**Windows (Command Prompt):**
```cmd
set DB_URL=jdbc:postgresql://localhost:5432/postgres
set DB_USER=postgres
set DB_PASS=your_password
```

**Windows (PowerShell):**
```powershell
$env:DB_URL  = "jdbc:postgresql://localhost:5432/postgres"
$env:DB_USER = "postgres"
$env:DB_PASS = "your_password"
```

## Running the App

### Option 1 — NetBeans IDE (Recommended)

1. Open NetBeans and go to **File → Open Project**.
2. Navigate to this folder and open it.
3. Set your environment variables (see above) or configure them in NetBeans under **Run → Set Project Configuration → Customize → Run → VM Options**:
   ```
   -DDB_URL=jdbc:postgresql://localhost:5432/postgres -DDB_USER=postgres -DDB_PASS=your_password
   ```
4. Click the **Run** button (F6).

### Option 2 — Command Line

1. Compile the project:
   ```cmd
   javac -cp "dist/lib/*" -d build/classes src/website/*.java
   ```
2. Run it:
   ```cmd
   java -cp "build/classes;dist/lib/*" website.Website
   ```

## Project Structure

```
Website/
├── src/
│   ├── images/          # App image assets
│   └── website/         # Java source files (.java) and form files (.form)
├── nbproject/           # NetBeans project config
├── build.xml            # Ant build script
├── manifest.mf          # JAR manifest
└── README.md
```

## Features

- User sign up and login
- Home page with pizza menu
- Shopping cart
- Order placement
- Payment page
