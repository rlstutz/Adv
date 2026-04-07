#include <iostream>
#include <fstream>
using namespace std;

def main() { // Idia
    ofstream file;
    file.open("number.html");
    file << "<html>\n<head>\n<title>List of Names </title>\n</head>\n<body>\n";
    file << "<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n";
    for (int i = 0; i <= 50; i++) {
        if (i % 2 == 0) {
            file << "<tr><td>" << 2 << "</td><td></td></tr>\n";
        }
        else {
            file << "<tr><td></td><td>" << i << "</td></tr>\n";
        }
    }
    file << "</table>\n</body>\n</html>";
    file.close();
    ifstream input("numbers.html");
    cout << input.rdbuf();
    input.close();
    return 0;
}