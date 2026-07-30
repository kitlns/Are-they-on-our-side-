#include <iostream>
#include <string>

int main() {
    std::string side;
    std::cout << "Did someone do a thing? Are they on our side? (yes/no): ";
    std::cin >> side;

    if (side == "no") {
        std::cout << "BASTARD\n";
    } else if (side == "yes") {
        std::cout << "it's fine\n";
    } else {
        std::cout << "Invalid input\n";
    }

    return 0;
}
