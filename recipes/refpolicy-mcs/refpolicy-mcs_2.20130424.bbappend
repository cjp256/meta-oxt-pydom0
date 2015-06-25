do_install_append() {
    sed -i 's/enforcing/permissive/g' ${D}/etc/selinux/config
}

PRINC := "${@int(PRINC) + 1}"
