public boolean isValidBST(TreeNode root) {
    return isValidBST(root, null);
}

private boolean isValidBST(TreeNode node, TreeNode prev) {
    if (node == null) return true;

    if (!isValidBST(node.left, prev)) return false;

    // Check the current node's value
    if (prev != null && node.val <= prev.val) return false;
    prev = node;

    return isValidBST(node.right, prev);
}
