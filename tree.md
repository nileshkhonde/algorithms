###### Tree will have root and references to child nodes. N nodes will have N-1 edges. It is a Directed Acyclic Graph.
###### Binary tree will have atmost 2 children. Left and Right.
###### Preorder Traversal - Visit the node then visit left child then visit right child. (Node-LeftChild-RightChild)
###### Inorder Traversal - Visit the left subtree then visit node then visit right subtree. (LeftChild-Node-RightChild)
###### Postorder Traversal - Visit the left subtree then visit right subtree visit node then. (LeftChild-RightChild-Node)
###### BFS for level finding - Put one level nodes on queue, increase level, visit all queue elements and push all their children in.

###### BFS - Bread First Search - Nodes are visited level by level from top node. top node will be visited first and then level by level going to the bottom
###### DFS - Depth First Search - Depth is given a priority where in root is visited then we go in deep till a leaf of a branch then go up to root again 
###### and go bottom to another branch and so on. There are three types of traversal in DFS, Preorder, inorder and postorder.
1. Max depth of the tree - pass 1+n depth for each recursive call to find the max depth
2. Validate tree - with min max traverse the tree in preorder to find if any non confirming node. 
3. Mirror of the tree - compare two instance of same tree to check if they are mirror or not

