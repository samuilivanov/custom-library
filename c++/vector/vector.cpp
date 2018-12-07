#include <iostream>

template <typename T>
class ArrayList {
private:
        T *data;
        int size;
        const int CAPACITY = 2;
   
        void clear()
        {
                this->size = 0;
        }
        void ensureCapacity(int capacity)
        {
                int i;
                T *old = data;
                delete data;
                data = new T[capacity];
                for (i = 0; i < size; i++)
                        data[i] = old[i];
        }
   
public:
        ArrayList()
        {
                clear();
                data = nullptr;
                ensureCapacity(CAPACITY);
        }
 
        ~ArrayList()
        {}

        int getCount()
        {
                return size;
        }
        T get(int idx)
        {
                try {
                        if (idx < 0 || idx > getCount())
                                throw idx;
                }
                catch (const std::out_of_range& oor) {
                        std::cerr << "Out of Range error: " << oor.what() << '\n';
                }
                std::cout << data[idx];
                return data[idx];
        }

        void set(int idx, T val)
        {
                try {
                        if (idx < 0 || idx > getCount())
                                throw idx;
                }
                catch (const std::out_of_range& oor) {
                        std::cerr << "Out of Range error: " << oor.what() << '\n';
                }
                data[idx] = val;
        }

        void add (T val)
        {
                if (size > *(&data + 1) - data)
                        ensureCapacity(size * 2);
                data[this->size++] = val;

        }

        T removeAt(int idx)
        {
                try {
                        if (idx < 0 || idx > getCount())
                                throw idx;
                }
                catch (const std::out_of_range& oor) {
                        std::cerr << "Out of Range error: " << oor.what() << '\n';
                }
                int i;
                for (i = idx; i < size; i++)
                        data[i] = data[i + 1];
                return data[idx];
        }

        void display() {
                int i;
                for (i = 0; i < size; i++)
                        std::cout << data[i] << std::endl;
        }
};
 
int main()
{
    ArrayList<int> list;
   
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.display();
    return 0;
}
