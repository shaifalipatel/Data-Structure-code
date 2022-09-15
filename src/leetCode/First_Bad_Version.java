package leetCode;

public class First_Bad_Version {

    /*Input: n = 5, bad = 4
    Output: 4
    Explanation:
    call isBadVersion(3) -> false
    call isBadVersion(5) -> true
    call isBadVersion(4) -> true
    Then 4 is the first bad version*/

    public int firstBadVersion(int n) {
        int i=1, j=n;
        while (i<j){
            int mid= i+(j-i)/2;  //5/2 = 2
            if(isBadVersion(mid))
                j = mid;
            else
                i=mid+1;
        }
    return i;

    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
