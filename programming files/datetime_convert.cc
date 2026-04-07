// JO

#include <iostream>
#include <iomanip>
#include <sstream>
#include <chrono>

int main()
{
    std::string date_str = "2022-03-17 10:45:30";
    std::tm date_obj = {};
    std::istringstream ss(date);
    ss >> std::get_time(&date_obj, "%m-%d-%Y %H:%M:%S");
    std::stringstream formatted_date_ss;
    format_date_ss << std::put_time(&date_obj, "%Y/%D/%m %H:%M:%S");
    std::string formatted_date = formatted_date.str();

    std::cout << formatted_date << std::endl;

    return 0;
}

// JO