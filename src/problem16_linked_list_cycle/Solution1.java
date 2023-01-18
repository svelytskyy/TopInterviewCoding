package problem16_linked_list_cycle;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
	
	public boolean hasCycle(ListNode head) {
        Set<ListNode> cache = new HashSet<>();
        ListNode node = head;
        while (node != null) {
            if (cache.contains(node)) {
                return true;
            }
            cache.add(node);
            node = node.next;
        }
        return false;
    }

}
