/* https://leetcode.com/problems/design-hashmap/ */
class MyHashMap {
    
    int hash[];
    public MyHashMap() {
        hash = new int[10000000];
        for(int i=0;i<hash.length;i++) {
            hash[i] = -1;
        }
    }
    
    public void put(int key, int value) {
        hash[key] = value;
    }
    
    public int get(int key) {
        return hash[key];
    }
    
    public void remove(int key) {
        hash[key] = -1;
    }
}
