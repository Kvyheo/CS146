def isValidBST(self, root):
    return self.is_valid_bst(root, None)

def is_valid_bst(self, node, prev):
    if node is None:
        return True

    if not self.is_valid_bst(node.left, prev):
        return False

    # Check the current node's value
    if prev is not None and node.val <= prev.val:
        return False
    prev = node

    return self.is_valid_bst(node.right, prev)
