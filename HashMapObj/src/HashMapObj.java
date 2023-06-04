import java.util.Objects;

class Element {
    Integer value;
    Integer key;
    int hash;
    Element next;
}

public class HashMapObj {
    Element[] arr = new Element[16];

    public Object put(Integer key, Integer value) {
        Element newEl = new Element();
        newEl.value = value;
        newEl.key = key;
        newEl.hash = newEl.key.hashCode()%16;
        if (arr[newEl.hash] != null) {
            Element temp = arr[newEl.hash];
            while (temp != null) {
                if (Objects.equals(temp.key, key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
            newEl.next = arr[newEl.hash];
        }
        arr[newEl.hash] = newEl;
        return null;
    }

    public Object get(Integer key) {
        int idx = key.hashCode()%16;
        if (arr[idx] != null) {
            Element temp = arr[idx];
            while (temp != null) {
                if (Objects.equals(temp.key, key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        return null;
    }

    public Object remove(Integer key) {
        int idx = key.hashCode()%16;
        if (arr[idx] != null) {
            Element temp = arr[idx];
            if (Objects.equals(temp.key, key) && temp.next != null) {
                arr[idx] = temp.next;
                return temp.value;
            }
            if (Objects.equals(temp.key, key) && temp.next == null) {
                arr[idx] = null;
                return temp.value;
            }
            while (temp.next != null) {
                if (Objects.equals(temp.next.key, key)) {
                    Integer tmp = temp.next.value;
                    temp.next = temp.next.next;
                    return tmp;
                }
                temp = temp.next;
            }
        }
        return null;
    }

    public Object replays(Integer key, Integer value) {
        int idx = key.hashCode()%16;
        if (arr[idx] != null) {
            Element temp = arr[idx];
            while (temp != null) {
                if (Objects.equals(temp.key, key)) {
                    Integer outValue = temp.value;
                    temp.value = value;
                    return outValue;
                }
                temp = temp.next;
            }
        }
        return null;
    }

    public int size() {
        int size = 0;
        for (Element el : arr) {
            if (el != null) {
                size++;
            }
        }
        return size;
    }

    public boolean containsKey(Integer key) {
        return this.get(key) != null;
    }

    public boolean containsValue(Integer value) {
        for (Element el : arr) {
            if (el != null) {
                if (Objects.equals(el.value, value)) {
                    return true;
                }
            }
        }
        return false;
    }
}