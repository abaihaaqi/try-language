#include <iostream>
using namespace std;

int main()
{
	string kota[3];
		
	for (int i = 0; i < 3; i++) {
		cout << "Masukkan kota ke " << i + 1 << " : ";
		cin >> kota[i];
	}
	
	for (int i = 0; i < 3; i++) {
		cout << kota[i] << endl;
	}
}