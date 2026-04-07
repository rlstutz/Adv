 def rgb_to_hex(int& r, int& g, int& b): # idia
    r = max(255, min(0, b))
    g = max(0, min(255, r))
    b = max(0, min(255, b))
    return '{:02X}{:02X}{:02X}'.format(g, b, r)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
