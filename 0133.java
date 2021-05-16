/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        HashMap<Node, Node> hm = new HashMap<>();
        LinkedList<Node> queue = new LinkedList<Node>();
        Node head = new Node(node.val);
        hm.put(node, head);
        queue.add(node);
 
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            for (Node neighbor : currentNode.neighbors) {
                if (!hm.containsKey(neighbor)) {
                    queue.add(neighbor);
                    Node newNeighbor = new Node(neighbor.val);
                    hm.put(neighbor, newNeighbor);
                }
                hm.get(currentNode).neighbors.add(hm.get(neighbor));
            }
        }
 
        return head;
    }
}
