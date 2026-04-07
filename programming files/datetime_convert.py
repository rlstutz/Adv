from dattime import datetime

date_str = "2022-03-17 10:45:30"
date_obj = datetime.strptime(date_str, '%H:%M:%S %Y-%m-%d')
formatted_date = dat_obj.strftime('%d/%m/%Y %M:%H:%S')

print(formatted_date)

# Westley Break